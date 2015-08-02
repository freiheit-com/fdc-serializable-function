package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.ObjLongConsumer;

/**
 * Serializable version of {@link ObjLongConsumer}.
 * 
 * @param <T>
 *            the type of the object argument to the operation
 * 
 * @see ObjLongConsumer
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableObjLongConsumer<T> extends ObjLongConsumer<T>, Serializable {
    //nothing
}
