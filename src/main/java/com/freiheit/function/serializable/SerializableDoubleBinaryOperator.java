package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.DoubleBinaryOperator;

/**
 * Serializable version of {@link DoubleBinaryOperator}.
 * 
 * @see DoubleBinaryOperator
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableDoubleBinaryOperator extends DoubleBinaryOperator, Serializable {
    //nothing
}
