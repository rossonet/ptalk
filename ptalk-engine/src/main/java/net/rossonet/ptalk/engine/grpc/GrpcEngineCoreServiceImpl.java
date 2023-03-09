package net.rossonet.ptalk.engine.grpc;

import org.joda.time.Instant;

import io.grpc.stub.StreamObserver;
import net.rossonet.ptalk.base.grpc.GenericMessageReply;
import net.rossonet.ptalk.base.grpc.GenericMessageRequest;
import net.rossonet.ptalk.base.grpc.HealthRequest;
import net.rossonet.ptalk.base.grpc.LogRequest;
import net.rossonet.ptalk.base.grpc.RegisterReply;
import net.rossonet.ptalk.base.grpc.RegisterRequest;
import net.rossonet.ptalk.base.grpc.RpcCoreV1Grpc.RpcCoreV1ImplBase;
import net.rossonet.ptalk.base.grpc.Status;
import net.rossonet.ptalk.base.grpc.StatusValue;
import net.rossonet.ptalk.base.grpc.Timestamp;
import net.rossonet.ptalk.engine.PTalkEngineRuntime;
import net.rossonet.ptalk.engine.exceptions.RegistrationErrorException;
import net.rossonet.ptalk.engine.exceptions.TaskManagerException;

public class GrpcEngineCoreServiceImpl extends RpcCoreV1ImplBase {

	private final PTalkEngineRuntime pTalkEngineRuntime;

	public GrpcEngineCoreServiceImpl(PTalkEngineRuntime pTalkEngineRuntime) {
		this.pTalkEngineRuntime = pTalkEngineRuntime;
	}

	private void checkSecurityAspect(RegisterRequest request) throws TaskManagerException {
		// TODO Implementare i vincoli per la registrazione

	}

	public PTalkEngineRuntime getpTalkEngineRuntime() {
		return pTalkEngineRuntime;
	}

	@Override
	public void health(HealthRequest request, StreamObserver<Status> responseObserver) {
		// TODO implementazione gestione health da componenti esterni
		super.health(request, responseObserver);
	}

	@Override
	public void log(LogRequest request, StreamObserver<Status> responseObserver) {
		// TODO implementare registrazione log da composnenti esterni registrati
		super.log(request, responseObserver);
	}

	@Override
	public void message(GenericMessageRequest request, StreamObserver<GenericMessageReply> responseObserver) {
		// TODO implementare ricezione messaggi generici
		super.message(request, responseObserver);
	}

	private RegisterReply prepareReplyWithCertificateSign(RegisterRequest request) {
		// TODO firmare il csr e completare i dati per la risposta alla registrazione
		return RegisterReply.newBuilder().setStatusRegistration(StatusValue.STATUS_GOOD)
				.setTimestamp(Timestamp.newBuilder().setMilliSeconds(Instant.now().getMillis()).build())
				.setUnitUniqueName(request.getUnitUniqueName()).build();
	}

	@Override
	public void register(RegisterRequest request, StreamObserver<RegisterReply> responseObserver) {
		try {
			checkSecurityAspect(request);
			switch (request.getUnitType()) {
			case ABILITY:
				pTalkEngineRuntime.getAbilityCommunicationFactFactory().registerUnit(request);
				break;
			case CHANNEL:
				pTalkEngineRuntime.getChannelCommunicationFactFactory().registerUnit(request);
				break;
			case NLU:
				pTalkEngineRuntime.getNluCommunicationFactFactory().registerUnit(request);
				break;
			case SELF:
				pTalkEngineRuntime.getSuperManagerFactFactory().registerUnit(request);
				break;
			case UNRECOGNIZED:
				throw new RegistrationErrorException("UNRECOGNIZED unit type");
			default:
				throw new RegistrationErrorException("UNRECOGNIZED unit type");
			}
			responseObserver.onNext(prepareReplyWithCertificateSign(request));
			responseObserver.onCompleted();
		} catch (final TaskManagerException e) {
			responseObserver.onError(e);
		}
	}

}
