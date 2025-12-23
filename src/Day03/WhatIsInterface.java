public static void main(String[] args) {
    interface StudentRules {
        void showID();

        void takeExam();

        void payFees();
    }
    class WhatIsInterface implements StudentRules {

        public void showID() {
            System.out.println("Nishi shows her ID card");
        }

        public void takeExam() {
            System.out.println("Nishi is giving the exam");
        }

        public void payFees() {
            System.out.println("Nishi pays the fees online");
        }
    }
}
