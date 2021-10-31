package cpen221practice;

class IsogramChecker {

    boolean isIsogram(String phrase) {

        phrase = phrase.toLowerCase();
        phrase = phrase.replaceAll(" ", "");
        phrase = phrase.replaceAll("-", "");

        if(phrase.length() == 1){
            return true;
        }
        for (int i = 0; i < phrase.length(); i++) {
            for (int j = i + 1; j < phrase.length(); j++) {

                if(phrase.charAt(i) == phrase.charAt(j)){
                    return false;
                }
            }

        }

     return true;
    }

}
