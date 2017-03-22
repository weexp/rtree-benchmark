package com.github.ambling;

/**
 * Test on R*-tree with maximum 32 children.
 */
public class RStarTreeM32 extends RStarTree {
    @Override
    int maxChildren() {
        return 32;
    }
}
