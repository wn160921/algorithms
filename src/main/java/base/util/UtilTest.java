package base.util;

import edu.princeton.cs.algs4.StdRandom;
import org.junit.Test;

public class UtilTest {

    @Test
    public void testTimeWatch(){
        int N = 2000;
        int[] a=new int[N];
        for(int i=0;i<N;i++){
            a[i]= StdRandom.uniform(-1000000,1000000);
        }
        StopWatch stopWatch=new StopWatch();
        int cnt = ThreeSum.count(a);
        double time = stopWatch.elapsedTime();
        System.out.println(cnt+"triples "+time+" seconds");
    }
}
