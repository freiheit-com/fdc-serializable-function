package com.freiheit.function.serializable;

import java.io.Serializable;
import java.util.function.IntToDoubleFunction;

/**
 * Serializable version of {@link IntToDoubleFunction}.
 * 
 * @see IntToDoubleFunction
 * @author Michael Bohn (initial creation)
 */
@FunctionalInterface
public interface SerializableIntToDoubleFunction extends IntToDoubleFunction, Serializable {
    //nothing
}
