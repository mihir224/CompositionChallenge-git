public class CompositionChallenge {
    public static void main(String[] args) {
        Door door1=new Door(true,"Wooden");
        Door door2=new Door(false,"Wooden");
        Table table=new Table("Wooden", false);
        Wall wall1=new Wall("Blue", "Concrete");
        Wall wall2=new Wall("White", "Concrete");
        Bed bed=new Bed(2,"double");
        Chair chair=new Chair("Metal+Plastic",true);
        Almirah almirah=new Almirah(4, 2);
        Room room=new Room(bed, almirah, wall1, wall2, table, door1, door2, chair);
        room.chair.getChairLegs(4);
        room.almirah.getClothes(16);
        room.bed.getBlanket(2);


    }
    public static class Room{
        private Bed bed;
        private Almirah almirah;
        private Wall wall1;
        private Wall wall2;
        private Table table;
        private Door door1;
        private Door door2;
        private Chair chair;

        public Room(Bed bed, Almirah almirah, Wall wall1, Wall wall2, Table table, Door door1, Door door2, Chair chair) {
            this.bed = bed;
            this.almirah = almirah;
            this.wall1 = wall1;
            this.wall2 = wall2;
            this.table = table;
            this.door1 = door1;
            this.door2 = door2;
            this.chair = chair;
        }

        public Bed getBed() {
            return bed;
        }

        public Almirah getAlmirah() {
            return almirah;
        }

        public Wall getWall1() {
            return wall1;
        }

        public Wall getWall2() {
            return wall2;
        }

        public Table getTable() {
            return table;
        }

        public Door getDoor1() {
            return door1;
        }

        public Door getDoor2() {
            return door2;
        }

        public Chair getChair() {
            return chair;
        }

    }
    public static class Door {
        private boolean lock;
        private String material;

        public Door(boolean lock, String material) {
            this.lock = lock;
            this.material = material;
        }

        public boolean isLock() {
            return lock;
        }

        public String getMaterial() {
            return material;
        }
        public void getLocks(int locks)
        {
            System.out.println("The door has " + locks + "locks");
        }
    }
    public static class Table {
        private String material;
        private boolean tableCloth;

        public String getMaterial() {
            return material;
        }

        public boolean isTableCloth() {
            return tableCloth;
        }

        public Table(String material, boolean tableCloth) {
            this.material = material;
            this.tableCloth = tableCloth;

        }
        public void getPlates(int plates)
        {
            System.out.println("The table has: " + plates + "plates");
        }
    }
    public static class Wall {
        private String colour;
        private String type ;

        public Wall(String colour, String type) {
            this.colour = colour;
            this.type = type;
        }

        public String getColour() {
            return colour;
        }

        public String getType() {
            return type;
        }
        public void getWallPaintings(int paintings)
        {
            System.out.println("Wall has " + paintings + " paintings");
        }
    }
    public static class Bed {
        private int pillows;
        private String type;

        public Bed(int pillows, String type) {
            this.pillows = pillows;
            this.type = type;
        }
        public int getPillows() {
            return pillows;
        }
        public String getType() {
            return type;
        }
        public void getBlanket(int blanket) {
            System.out.println("No. of blankets are: " + blanket);
        }
    }
    public static class Chair {
        private String material;
        private boolean hasWheels;

        public Chair(String material, boolean hasWheels) {
            this.material = material;
            this.hasWheels = hasWheels;
        }

        public String getMaterial() {
            return material;
        }

        public boolean isHasWheels() {
            return hasWheels;
        }
        public void getChairLegs(int legs)
        {
            System.out.println("The chair has " + legs + " legs");
        }
    }
    public static class Almirah {
        private int shelves;
        private int handles;

        public Almirah(int shelves,int handles)
        {
            this.handles=handles;
            this.shelves=shelves;
        }
        public int getShelves()
        {
            return shelves;
        }
        public int getHandles()
        {
            return handles;
        }
        public void getClothes(int clothes)
        {
            System.out.println("The no. of clothes in the almirah are: " + clothes);
        }


    }







}
