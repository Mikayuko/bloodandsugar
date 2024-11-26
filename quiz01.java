public class quiz01 {
        public static void main(String[] args) {
                Case test01 = new Case();
                test01.setBlood(139); 
                test01.setSugar(125);  
                test01.testcase();
        }
    }
    
class Case {
        private int blood;
        private int sugar;
    
         Case() {
            this.blood = 0;
            this.sugar = 0;
        }
    
        public void setBlood(int blood) {
            this.blood = blood;
        }
    
        public void setSugar(int sugar) {
            this.sugar = sugar;
        }
   
         public void testcase() {
            if (this.blood <= 120 && this.sugar < 100) {
                System.out.println("General");
            } else if (this.blood > 120 && this.blood <= 139 && this.sugar >= 100 && this.sugar <= 125) {
                System.out.println("Risk");
            } else if (this.blood <= 139 && this.sugar <= 125) {
                System.out.println("High Risk level 0");
            } else if (this.blood >= 140 && this.blood <= 159 && this.sugar > 125 && this.sugar <= 154) {
                System.out.println("High Risk level 1");
            } else if (this.blood >= 160 && this.blood <= 179 && this.sugar >= 155 && this.sugar <= 182) {
                System.out.println("High Risk level 2");
            } else if (this.blood >= 180 && this.sugar >= 183) {
                System.out.println("High Risk level 3");
            }
        }
 
        public int getBlood() {
            return this.blood;
        }
    
        public int getSugar() {
            return this.sugar;
        }
    }
    