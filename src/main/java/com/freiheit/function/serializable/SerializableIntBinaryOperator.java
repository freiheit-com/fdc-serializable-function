package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.IntBinaryOperator;

/**
 * Serializable version of {@link IntBinaryOperator}.
 * 
 * @see IntBinaryOperator
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableIntBinaryOperator extends IntBinaryOperator, Serializable {
    //nothing
}
