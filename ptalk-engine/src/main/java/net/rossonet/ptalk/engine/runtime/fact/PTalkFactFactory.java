package net.rossonet.ptalk.engine.runtime.fact;

import java.io.Closeable;

import net.rossonet.ptalk.engine.runtime.Task;

public interface PTalkFactFactory extends Closeable {

	PTalkFact getOrCreate(Task rulesEngineTask);

	void remove(Task rulesEngineTask);

	void updateConfiguration();

}
