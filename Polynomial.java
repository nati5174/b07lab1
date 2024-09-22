class Polynomial {


        double[] x;

        public Polynomial(){

                x = new double[] {0};

        }

        public  Polynomial(double[] arr) {
        	x = arr; // Assign to the instance variable

        }

	public Polynomial add(Polynomial i){

		int len1 = this.x.length;
    		int len2 = i.x.length;
    
    
    		if (len1 >= len2){
    			for (int e = 0; e < len2; e++){
            			this.x[e] = this.x[e] + i.x[e];
            		 }

			return this;
          	}
     
    		else {
    			double[] new_array = new double[len2];
    			for (int e = 0; e < len1; e++){
    				new_array[e] = i.x[e] + this.x[e];
            		}
            
         		for (int w = len1; w < len2; w++){
         			new_array[w] = i.x[w];
            		}
            
          		this.x = new_array;
          		return this;
	    	 }
	}
	public double evaluate(double sclr){

  		int len = this.x.length;
    		double total = this.x[0];
    
    		if (len ==1){
    			return total;
        	}

  		else {
    			for (int i = 1; i < len; i++){
        			total = total + this.x[i] * Math.pow(sclr, i);
            		}
            		return total;
		}
      	  }

	public  boolean hasRoot(double q){

	
		if (evaluate(q) == 0){
			return true;
		}
		
		return false;
	}


}


