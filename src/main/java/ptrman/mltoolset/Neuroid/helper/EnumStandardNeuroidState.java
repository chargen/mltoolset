package ptrman.mltoolset.Neuroid.helper;

/**
 *
 */
public enum EnumStandardNeuroidState {
    AvailableMemory,          // AM    used for the unsupervised memory learning algorithm
    AvailableMemory1,         // AM1   used for the unsupervised memory learning algorithm
    UnsupervisedMemory,       // UM    used for the unsupervised memory learning algorithm
    UnsuperviseMemoryFired,   // UMF   used for the supervised memory learning algorithm
    UnsupervisedMemory1,      // UM1   used for the supervised memory learning algorithm
    SupervisedMemory,         // SM    used for the supervised memory learning algorithm
    Relay,                    // R     used for the supervised memory learning algorithm

    JoinEnhancedPoised,       //       used for the PJOIN algorithm
    JoinEnhancedDismissed,    //       used for the PJOIN algorithm
    JoinEnhancedOperational,  //       used for the PJOIN algorithm
    LinkEnhancedPrepared,     //       used for the PJOIN algorithm
    LinkEnhancedLOperational, //       used for the PJOIN algorithm

    JoinPOperational          //       used for the PJOIN algorithm
}
