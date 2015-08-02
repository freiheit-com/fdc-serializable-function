package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.ObjIntConsumer;

/**
 * Serializable version of {@link ObjIntConsumer}.
 * 
 * @param <T>
 *            the type of the object argument to the operation
 * 
 * @see ObjIntConsumer
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableObjIntConsumer<T> extends ObjIntConsumer<T>, Serializable {
    //nothing
}
