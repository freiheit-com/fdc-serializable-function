package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.DoublePredicate;

/**
 * Serializable version of {@link DoublePredicate}.
 * 
 * @see DoublePredicate
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableDoublePredicate extends DoublePredicate, Serializable {
    //nothing
}
