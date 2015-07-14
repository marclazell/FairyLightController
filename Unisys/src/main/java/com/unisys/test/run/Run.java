package com.unisys.test.run;

import com.unisys.test.algorithm.Algorithm;
import com.unisys.test.algorithm.AlternateAlgorithm;
import com.unisys.test.algorithm.ColourAlgorithm;
import com.unisys.test.algorithm.SequenceAlgorithm;
import com.unisys.test.enums.AlgorithmName;
import com.unisys.test.exception.AlgorithmNameException;
import com.unisys.test.pojo.FairyLightLength;

import java.util.Arrays;
import java.util.HashMap;

import static com.google.common.base.Preconditions.checkArgument;
import static com.google.common.base.Preconditions.checkNotNull;

/**
 * Created by dev on 14/07/15.
 */
public class Run {

    private static FairyLightLength fairyLightLength;
    private static HashMap<String, Algorithm> ALGORITHM_LIST = new HashMap<String, Algorithm>();

    public static void main(String[] args) throws AlgorithmNameException {

        // put accept algorithms in the list
        ALGORITHM_LIST.put(ColourAlgorithm.NAME, new ColourAlgorithm());
        ALGORITHM_LIST.put(SequenceAlgorithm.NAME, new SequenceAlgorithm());
        ALGORITHM_LIST.put(AlternateAlgorithm.NAME, new AlternateAlgorithm());

        // parameter checks
        checkArgument(args.length > 0, "Arg array is empty");
        checkNotNull(args[0]);


        String algorithmName = args[0];

        // create length of lights (default to 20 lights)
        fairyLightLength = LengthFactory.createDefault();

        // check algorithm name exists
        if (!Arrays.toString(AlgorithmName.values()).toUpperCase().contains(algorithmName.toUpperCase())) {
            throw new AlgorithmNameException("The algorithm name " + algorithmName + " is not valid");
        }

        Algorithm algorithmToRun = null;

        for (String name : ALGORITHM_LIST.keySet()) {
            if (algorithmName.toUpperCase().equals(name)) {
                ALGORITHM_LIST.get(name).run(fairyLightLength);
            }
        }
    }
}
