class Enclosing {
    void run() {
		// deltegate == owner == this 
        def cl = { getDelegate() }                          
        def cl2 = { delegate }                              
        assert cl() == cl2()                               
        assert cl() == this                                 
        def enclosed = {
			// delegate默认是owner的值,所以这里会返回enclosed
            { -> delegate }.call()                          
        }
        assert enclosed() == enclosed                       
    }
}

def enclosing = new Enclosing()
enclosing.run()