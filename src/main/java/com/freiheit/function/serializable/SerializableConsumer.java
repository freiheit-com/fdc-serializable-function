package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.Consumer;

/**
 * Serializable version of {@link Consumer}.
 * 
 * @param <T>
 *            the type of the input to the operation
 * 
 * @see Consumer
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableConsumer<T> extends Consumer<T>, Serializable {
    //nothing
}
