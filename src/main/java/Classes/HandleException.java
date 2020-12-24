package Classes;

public class HandleException {

        public static class SlotsAmount extends Exception {
        final private MotherBoard boardEx;


        public SlotsAmount(String message, MotherBoard boardEx) {
            super(message);
            this.boardEx = boardEx;
        }

        public String getMotherboard() {
            return this.toString();
        }

        public MotherBoard getBoardEx() {
            return this.boardEx;
        }
    }

        public static class EmptyReturn extends Exception {
            public EmptyReturn(String errorMessage) {
                super(errorMessage);
            }
        }
}
