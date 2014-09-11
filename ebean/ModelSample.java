class ModelSample {
  
  
      public static List<Sample> findBySample() {

        return 
        
              new Model.Finder<Object, Sample>("MASTER", Object.class, Sample.class).where()
                
                // OR条件
                .disjunction()
                
                  // AND条件
                  .conjunction().ne("id", 1).ne("id", 2)

                  .ne("name", "gomi")
                  .eq("date", "2013-01-01")
                  .eq("created", "2013-02-09")

                .endJunction()
  
                .eq("flg1", true)
                .eq("flg2", false)
                
                .findList();
    }
}
