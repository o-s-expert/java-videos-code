package expert.os.strategy;

public enum Cooks implements Cook {

    ITALIAN{
        @Override
        public String prepare() {
            return "Making Pizza";
        }
    }, BRAZILIAN{
        @Override
        public String prepare() {
            return "Making Feijoada";
        }
    };
}
