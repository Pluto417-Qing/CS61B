package bomb;

import common.IntList;

public class BombMain {
    public static void answers(String[] args) {
        int phase = 2;
        IntList answer = new IntList(8,null);
        answer = new IntList(0,answer);
        answer = new IntList(3,answer);
        answer = new IntList(9,answer);
        answer = new IntList(0,answer);
        if (args.length > 0) {
            phase = Integer.parseInt(args[0]);
        }
        // TODO: Find the correct inputs (passwords) to each phase using debugging techniques
        Bomb b = new Bomb();
        if (phase >= 0) {
            b.phase0("39291226");
        }
        if (phase >= 1) {
            b.phase1(answer); // Figure this out too
        }
        if (phase >= 2) {
            b.phase2("793227803");
        }
    }
}
