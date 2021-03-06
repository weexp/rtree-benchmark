package com.github.ambling.rtreebenchmark;

import com.github.davidmoten.rtree.RTree;
import com.github.davidmoten.rtree.geometry.Point;
import com.github.davidmoten.rtree.geometry.Rectangle;

/**
 * Test on default RTree (quadratic splitter (Guttman)) with various maximum children.
 */
public abstract class DefaultRTree extends RTreeBenchmark {
    abstract int maxChildren();

    @Override
    RTree<Object, Point> createOnGreek() {
        return RTree.maxChildren(maxChildren()).<Object, Point> create().add(entriesGreek06);
    }

    @Override
    RTree<Object, Rectangle> createOn1k() {
        return RTree.maxChildren(maxChildren()).<Object, Rectangle> create().add(entries1k06);
    }

    public static class M4 extends DefaultRTree {
        @Override
        int maxChildren() {
            return 4;
        }
    }

    public static class M10 extends DefaultRTree {
        @Override
        int maxChildren() {
            return 10;
        }
    }

    public static class M32 extends DefaultRTree {
        @Override
        int maxChildren() {
            return 32;
        }
    }

    public static class M128 extends DefaultRTree {
        @Override
        int maxChildren() {
            return 128;
        }
    }
}
