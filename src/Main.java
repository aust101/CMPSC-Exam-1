public class Main {
    public static void main(String[] args) {
        //Initializing and storing
        final String[] names = new String[6];
        final double[] grades = new double[6];
        final double[] maxGrades = {100.0, 100.0, 100.0, 100.0, 100.0, 100.0};
        fillNames(names);
        fillGrades(grades);

        //Outputting
        String spacing = "| %1$-10s | %2$-10s | %3$-12s |\n";
        System.out.println("+----------------------------------------+");
        System.out.format(spacing, "Student", "Grade", "Letter Grade");
        System.out.println("+----------------------------------------+");
        for (int i = 0; i < names.length; i++) {
            double finalGrade = grades[i]/maxGrades[i] * 100.0;
            System.out.format(spacing, names[i], finalGrade + "%", getLetterGrade(finalGrade));
        }
        System.out.println("+----------------------------------------+");
    }

    /**
     * Fills the specified array with 5 anonymous names.
     * @param array with a size of at least 5.
     */
    private static void fillNames(String[] array) {
        array[0] = "Nate";
        array[1] = "Austin";
        array[2] = "Jelly";
        array[3] = "Lollero";
        array[4] = "Gold";
        array[5] = "Nick";
    }

    /**
     * Fills the specified array with 5 accurate grades, corresponding
     * to the names array element sequences.
     * @param array with a size of at least 5.
     */
    private static void fillGrades(double[] array) {
        array[0] = 100.0;
        array[1] = 99.99; //Just because I always seem to mess up somehow, in some way. 
        array[2] = 99.98; //Damn, jelly almost beat me.
        array[3] = 89.49;
        array[4] = 0.01; //That's unlucky.
        array[5] = 0.00;
    }

    /**
     * Calculates the "Letter" corresponding to a grade.
     * @param grade to be calculated
     * @return letter that corresponds to the specified grade
     */
    private static String getLetterGrade(double grade) {
        if(grade >= 100) return "A+";
        else if(grade >= 93) return "A";
        else if(grade >= 90) return "A-";
        else if(grade >= 86) return "B+";
        else if(grade >= 83) return "B";
        else if(grade >= 80) return "B-";
        else if(grade >= 76) return "C+";
        else if(grade >= 70) return "C";
        else if(grade >= 60) return "D";
        return "F";
    }
}
