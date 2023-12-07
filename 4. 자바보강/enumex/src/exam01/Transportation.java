package exam01;

public enum Transportation {
    BUS("버스", 1450) {
        @Override
        public int getTotal(int person) {
            return price * person;
        }
    },
    SUBWAY("지하철", 1500) {
        @Override
        public int getTotal(int person) {
            return price * person;
        }
    },
    TAXI("택시", 4200) {
        @Override
        public int getTotal(int person) {
            return price * person;
        }
    };

    private final String title;
    protected final int price;

    Transportation(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public abstract int getTotal(int person);

}
