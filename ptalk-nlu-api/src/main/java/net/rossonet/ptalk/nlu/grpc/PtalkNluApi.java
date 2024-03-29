// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: ptalk-nlu-api.proto

package net.rossonet.ptalk.nlu.grpc;

public final class PtalkNluApi {
  private PtalkNluApi() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nlu_NluModel_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nlu_NluModel_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nlu_TrainingLineLog_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nlu_TrainingLineLog_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nlu_NluMessageRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nlu_NluMessageRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nlu_NluMessageReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nlu_NluMessageReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nlu_NluTrainingModelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nlu_NluTrainingModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nlu_NluTrainingModelReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nlu_NluTrainingModelReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nlu_NluListModelsRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nlu_NluListModelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nlu_NluListModelsReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nlu_NluListModelsReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nlu_NluDeleteModelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nlu_NluDeleteModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nlu_NluDeleteModelReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nlu_NluDeleteModelReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nlu_NluSnapshotModelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nlu_NluSnapshotModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nlu_NluSnapshotModelReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nlu_NluSnapshotModelReply_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nlu_NluRestoreModelRequest_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nlu_NluRestoreModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_nlu_NluRestoreModelReply_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_nlu_NluRestoreModelReply_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n\023ptalk-nlu-api.proto\022\003nlu\032\024ptalk-base-a" +
      "pi.proto\"\224\001\n\010NluModel\022\032\n\022requiredCapabil" +
      "ity\030\001 \001(\t\022\r\n\005model\030\002 \001(\t\022\024\n\014modelVersion" +
      "\030\003 \001(\t\022\032\n\022jsonModelSignature\030\004 \001(\t\022\024\n\014in" +
      "putExample\030\005 \001(\t\022\025\n\routputExample\030\006 \001(\t\"" +
      "X\n\017TrainingLineLog\022\"\n\ttimestamp\030\001 \001(\0132\017." +
      "base.Timestamp\022\020\n\010logLevel\030\002 \001(\t\022\017\n\007mess" +
      "age\030\003 \001(\t\"\262\002\n\021NluMessageRequest\022\025\n\rflowR" +
      "eference\030\001 \001(\t\022\030\n\020messageReference\030\002 \001(\t" +
      "\022\025\n\roriginContext\030\003 \001(\t\022\034\n\005model\030\004 \001(\0132\r" +
      ".nlu.NluModel\022\021\n\treplyTask\030\005 \001(\t\022\033\n\007mess" +
      "age\030\006 \001(\0132\n.base.Data\022\023\n\013contextJson\030\007 \001" +
      "(\t\022#\n\017additionalDatas\030\010 \003(\0132\n.base.Data\022" +
      "\027\n\004tags\030\t \003(\0132\t.base.Tag\022\"\n\ttimestamp\030\n " +
      "\001(\0132\017.base.Timestamp\022\020\n\010traceLog\030\013 \001(\010\"\314" +
      "\002\n\017NluMessageReply\022\025\n\rflowReference\030\001 \001(" +
      "\t\022\030\n\020messageReference\030\002 \001(\t\022\025\n\roriginCon" +
      "text\030\003 \001(\t\022\034\n\005model\030\004 \001(\0132\r.nlu.NluModel" +
      "\022\014\n\004task\030\005 \001(\t\022\031\n\005reply\030\006 \001(\0132\n.base.Dat" +
      "a\022\023\n\013contextJson\030\007 \001(\t\022!\n\006status\030\010 \001(\0162\021" +
      ".base.StatusValue\022#\n\017additionalDatas\030\t \003" +
      "(\0132\n.base.Data\022\027\n\004tags\030\n \003(\0132\t.base.Tag\022" +
      "\"\n\ttimestamp\030\013 \001(\0132\017.base.Timestamp\022\020\n\010t" +
      "raceLog\030\014 \001(\010\"\314\002\n\027NluTrainingModelReques" +
      "t\022\025\n\rflowReference\030\001 \001(\t\022\034\n\005model\030\002 \001(\0132" +
      "\r.nlu.NluModel\022\023\n\013trainingJob\030\003 \001(\t\022\017\n\007t" +
      "estJob\030\004 \001(\t\022 \n\014trainingData\030\005 \003(\0132\n.bas" +
      "e.Data\022\034\n\010testData\030\006 \003(\0132\n.base.Data\022\"\n\016" +
      "trainingSecret\030\007 \003(\0132\n.base.Data\022\036\n\ntest" +
      "Secret\030\010 \003(\0132\n.base.Data\022\026\n\016timeoutMinut" +
      "es\030\t \001(\005\022\"\n\ttimestamp\030\n \001(\0132\017.base.Times" +
      "tamp\022\026\n\016trainingEngine\030\013 \001(\t\"\215\002\n\025NluTrai" +
      "ningModelReply\022\025\n\rflowReference\030\001 \001(\t\022\034\n" +
      "\005model\030\002 \001(\0132\r.nlu.NluModel\022!\n\006status\030\003 " +
      "\001(\0162\021.base.StatusValue\022\024\n\014trainingTime\030\004" +
      " \001(\003\022\020\n\010testTime\030\005 \001(\003\022)\n\013trainingLog\030\006 " +
      "\003(\0132\024.nlu.TrainingLineLog\022%\n\007testLog\030\007 \003" +
      "(\0132\024.nlu.TrainingLineLog\022\"\n\ttimestamp\030\010 " +
      "\001(\0132\017.base.Timestamp\"Q\n\024NluListModelsReq" +
      "uest\022\025\n\rflowReference\030\001 \001(\t\022\"\n\ttimestamp" +
      "\030\002 \001(\0132\017.base.Timestamp\"\220\001\n\022NluListModel" +
      "sReply\022\025\n\rflowReference\030\001 \001(\t\022\034\n\005model\030\002" +
      " \003(\0132\r.nlu.NluModel\022!\n\006status\030\003 \001(\0162\021.ba" +
      "se.StatusValue\022\"\n\ttimestamp\030\004 \001(\0132\017.base" +
      ".Timestamp\"p\n\025NluDeleteModelRequest\022\025\n\rf" +
      "lowReference\030\001 \001(\t\022\034\n\005model\030\002 \001(\0132\r.nlu." +
      "NluModel\022\"\n\ttimestamp\030\003 \001(\0132\017.base.Times" +
      "tamp\"s\n\023NluDeleteModelReply\022\025\n\rflowRefer" +
      "ence\030\001 \001(\t\022!\n\006status\030\002 \001(\0162\021.base.Status" +
      "Value\022\"\n\ttimestamp\030\003 \001(\0132\017.base.Timestam" +
      "p\"r\n\027NluSnapshotModelRequest\022\025\n\rflowRefe" +
      "rence\030\001 \001(\t\022\034\n\005model\030\002 \001(\0132\r.nlu.NluMode" +
      "l\022\"\n\ttimestamp\030\003 \001(\0132\017.base.Timestamp\"\234\001" +
      "\n\025NluSnapshotModelReply\022\025\n\rflowReference" +
      "\030\001 \001(\t\022!\n\006status\030\002 \001(\0162\021.base.StatusValu" +
      "e\022\"\n\ttimestamp\030\003 \001(\0132\017.base.Timestamp\022%\n" +
      "\021modelSnapshotData\030\004 \003(\0132\n.base.Data\"\230\001\n" +
      "\026NluRestoreModelRequest\022\025\n\rflowReference" +
      "\030\001 \001(\t\022\034\n\005model\030\002 \001(\0132\r.nlu.NluModel\022\"\n\t" +
      "timestamp\030\003 \001(\0132\017.base.Timestamp\022%\n\021mode" +
      "lSnapshotData\030\004 \003(\0132\n.base.Data\"t\n\024NluRe" +
      "storeModelReply\022\025\n\rflowReference\030\001 \001(\t\022!" +
      "\n\006status\030\002 \001(\0162\021.base.StatusValue\022\"\n\ttim" +
      "estamp\030\003 \001(\0132\017.base.Timestamp2U\n\014RpcNluC" +
      "oreV1\022E\n\027ReplyTrainingModelAsync\022\032.nlu.N" +
      "luTrainingModelReply\032\014.base.Status\"\0002\255\003\n" +
      "\014RpcNluUnitV1\022:\n\010CallSync\022\026.nlu.NluMessa" +
      "geRequest\032\024.nlu.NluMessageReply\"\000\022?\n\017Tra" +
      "inModelAsync\022\034.nlu.NluTrainingModelReque" +
      "st\032\014.base.Status\"\000\022B\n\nListModels\022\031.nlu.N" +
      "luListModelsRequest\032\027.nlu.NluListModelsR" +
      "eply\"\000\022E\n\013DeleteModel\022\032.nlu.NluDeleteMod" +
      "elRequest\032\030.nlu.NluDeleteModelReply\"\000\022K\n" +
      "\rSnapshotModel\022\034.nlu.NluSnapshotModelReq" +
      "uest\032\032.nlu.NluSnapshotModelReply\"\000\022H\n\014Re" +
      "storeModel\022\033.nlu.NluRestoreModelRequest\032" +
      "\031.nlu.NluRestoreModelReply\"\000B,\n\033net.ross" +
      "onet.ptalk.nlu.grpcB\013PtalkNluApiP\001b\006prot" +
      "o3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          net.rossonet.ptalk.base.grpc.PtalkBaseObject.getDescriptor(),
        });
    internal_static_nlu_NluModel_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_nlu_NluModel_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nlu_NluModel_descriptor,
        new java.lang.String[] { "RequiredCapability", "Model", "ModelVersion", "JsonModelSignature", "InputExample", "OutputExample", });
    internal_static_nlu_TrainingLineLog_descriptor =
      getDescriptor().getMessageTypes().get(1);
    internal_static_nlu_TrainingLineLog_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nlu_TrainingLineLog_descriptor,
        new java.lang.String[] { "Timestamp", "LogLevel", "Message", });
    internal_static_nlu_NluMessageRequest_descriptor =
      getDescriptor().getMessageTypes().get(2);
    internal_static_nlu_NluMessageRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nlu_NluMessageRequest_descriptor,
        new java.lang.String[] { "FlowReference", "MessageReference", "OriginContext", "Model", "ReplyTask", "Message", "ContextJson", "AdditionalDatas", "Tags", "Timestamp", "TraceLog", });
    internal_static_nlu_NluMessageReply_descriptor =
      getDescriptor().getMessageTypes().get(3);
    internal_static_nlu_NluMessageReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nlu_NluMessageReply_descriptor,
        new java.lang.String[] { "FlowReference", "MessageReference", "OriginContext", "Model", "Task", "Reply", "ContextJson", "Status", "AdditionalDatas", "Tags", "Timestamp", "TraceLog", });
    internal_static_nlu_NluTrainingModelRequest_descriptor =
      getDescriptor().getMessageTypes().get(4);
    internal_static_nlu_NluTrainingModelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nlu_NluTrainingModelRequest_descriptor,
        new java.lang.String[] { "FlowReference", "Model", "TrainingJob", "TestJob", "TrainingData", "TestData", "TrainingSecret", "TestSecret", "TimeoutMinutes", "Timestamp", "TrainingEngine", });
    internal_static_nlu_NluTrainingModelReply_descriptor =
      getDescriptor().getMessageTypes().get(5);
    internal_static_nlu_NluTrainingModelReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nlu_NluTrainingModelReply_descriptor,
        new java.lang.String[] { "FlowReference", "Model", "Status", "TrainingTime", "TestTime", "TrainingLog", "TestLog", "Timestamp", });
    internal_static_nlu_NluListModelsRequest_descriptor =
      getDescriptor().getMessageTypes().get(6);
    internal_static_nlu_NluListModelsRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nlu_NluListModelsRequest_descriptor,
        new java.lang.String[] { "FlowReference", "Timestamp", });
    internal_static_nlu_NluListModelsReply_descriptor =
      getDescriptor().getMessageTypes().get(7);
    internal_static_nlu_NluListModelsReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nlu_NluListModelsReply_descriptor,
        new java.lang.String[] { "FlowReference", "Model", "Status", "Timestamp", });
    internal_static_nlu_NluDeleteModelRequest_descriptor =
      getDescriptor().getMessageTypes().get(8);
    internal_static_nlu_NluDeleteModelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nlu_NluDeleteModelRequest_descriptor,
        new java.lang.String[] { "FlowReference", "Model", "Timestamp", });
    internal_static_nlu_NluDeleteModelReply_descriptor =
      getDescriptor().getMessageTypes().get(9);
    internal_static_nlu_NluDeleteModelReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nlu_NluDeleteModelReply_descriptor,
        new java.lang.String[] { "FlowReference", "Status", "Timestamp", });
    internal_static_nlu_NluSnapshotModelRequest_descriptor =
      getDescriptor().getMessageTypes().get(10);
    internal_static_nlu_NluSnapshotModelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nlu_NluSnapshotModelRequest_descriptor,
        new java.lang.String[] { "FlowReference", "Model", "Timestamp", });
    internal_static_nlu_NluSnapshotModelReply_descriptor =
      getDescriptor().getMessageTypes().get(11);
    internal_static_nlu_NluSnapshotModelReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nlu_NluSnapshotModelReply_descriptor,
        new java.lang.String[] { "FlowReference", "Status", "Timestamp", "ModelSnapshotData", });
    internal_static_nlu_NluRestoreModelRequest_descriptor =
      getDescriptor().getMessageTypes().get(12);
    internal_static_nlu_NluRestoreModelRequest_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nlu_NluRestoreModelRequest_descriptor,
        new java.lang.String[] { "FlowReference", "Model", "Timestamp", "ModelSnapshotData", });
    internal_static_nlu_NluRestoreModelReply_descriptor =
      getDescriptor().getMessageTypes().get(13);
    internal_static_nlu_NluRestoreModelReply_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_nlu_NluRestoreModelReply_descriptor,
        new java.lang.String[] { "FlowReference", "Status", "Timestamp", });
    net.rossonet.ptalk.base.grpc.PtalkBaseObject.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
