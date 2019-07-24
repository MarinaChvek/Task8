package com.homework.intervallib;
import java.util.ArrayList;
import java.util.List;
public class IntervalList {
        private List<Interval> intervalsList;

        public IntervalList() {
            intervalsList = new ArrayList<>();
        }
        public  void addInterval(Interval a) {
         intervalsList.add(a);
    }
         public  int size() {
           return intervalsList.size();
    }
         public Interval get(int i) {
      return  intervalsList.get(i);
    }


         public void maxRas() {// окружность с макс и мин площадью
            double max = 0;
            int maxInd=0;
            for (int i = 0; i < intervalsList.size() - 1; i++) {

                if ((intervalsList.get(i).getStart()-intervalsList.get(i).getEnd())>(intervalsList.get(i+1).getStart()-intervalsList.get(i + 1).getEnd())) {
                    max = intervalsList.get(i).getStart()-intervalsList.get(i).getEnd();
                    maxInd=i;
                    }



        }
            System.out.println("Интервал с самыми удаленными концами" + intervalsList.get(maxInd));
    }

}
