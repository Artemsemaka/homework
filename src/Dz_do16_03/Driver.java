package Dz_do16_03;

public class Driver {
        private Driver_Key key;
        private  Category category ;

        public Driver(Driver_Key key, Category category) {
                this.key = key;
                this.category = category;
        }
        public Category getCategory() {
                return category;
        }
        public int getKey_Lock(){
               return key.getKey_Lock();
        }
        @Override
        public String toString() {
                return "Driver{" +
                        "key=" + key +
                        ", category=" + category +
                        '}';
        }
}
