package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Students {


    String sName;
    int sMarks;

    Students(String sName,int sMarks){
        this.sName = sName;
        this.sMarks = sMarks;
    }

    public static void main(String[] args){
        List<Students> studentsList = Arrays.asList(
                new Students("Surya",30),
                new Students("Kumar",40),
                new Students("Kitti",50));

        //  Given a list of students with marks, find students who passed (marks ≥ 40).

        List<Students> studentPassedList = studentsList.stream()
                .filter(n-> n.sMarks>=40)
                .collect(Collectors.toList());
        studentPassedList.forEach(s-> System.out.println(s.sName + " "+ s.sMarks));

    }
}
