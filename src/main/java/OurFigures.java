  class Cube implements Figure {
        private Integer edge;

        public Cube(Integer edge) {
            if(edge == null || edge < 0)
            {
                throw new IllegalArgumentException("Не может быть отрицательным или иметь значение null");
            }
            this.edge = edge;
        }

        @Override
        public double getVolume() {
            return edge * edge * edge;
        }

  }

       class Sphere implements Figure {
           private Integer radius;

           public Sphere(Integer radius) {
               if(radius == null || radius < 0){
                   throw new IllegalArgumentException("Не может быть отрицательным или иметь значение null");
                   }
               this.radius = radius;
           }


           @Override
           public double getVolume() {
               return 4.0 / 3.0 * PI * radius * radius * radius;
           }


       }


    class Сylinder implements Figure {
        private Integer radius;
        private Integer high;

        public Сylinder(Integer radius, Integer high) {
            if (radius == null || radius < 0 || high == null || high < 0) {
                throw new IllegalArgumentException("Не может быть отрицательным или иметь значение null");
            }
            this.radius = radius;
            this.high = high;
        }


        @Override
        public double getVolume() {
             return PI * radius * radius * high;
        }


    }


