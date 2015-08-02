package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.IntUnaryOperator;

/**
 * Serializable version of {@link IntUnaryOperator}.
 * 
 * @see IntUnaryOperator
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableIntUnaryOperator extends IntUnaryOperator, Serializable {
    //nothing
}
