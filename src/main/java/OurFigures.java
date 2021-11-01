  class Cube implements Figure {
        private int edge;

        public Cube(int edge) {
            this.edge = edge;
        }

        @Override
        public double getVolume() {
            return edge * edge * edge;
        }

  }

       class Sphere implements Figure {
           private int radius;

           public Sphere(int radius) {
               this.radius = radius;
           }


           @Override
           public double getVolume() {
               return 4.0 / 3.0 * PI * radius * radius * radius;
           }


       }


    class Сylinder implements Figure {
        private int radius;
        private int high;

        public Сylinder(int radius, int high) {
            this.radius = radius;
            this.high = high;
        }

        @Override
        public double getVolume() {
             return PI * radius * radius * high;
        }


    }


