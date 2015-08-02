package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.ObjDoubleConsumer;

/**
 * Serializable version of {@link ObjDoubleConsumer}.
 * 
 * @param <T>
 *            the type of the object argument to the operation
 * 
 * @see ObjDoubleConsumer
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableObjDoubleConsumer<T> extends ObjDoubleConsumer<T>, Serializable {
    //nothing
}
