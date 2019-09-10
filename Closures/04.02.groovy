class Enclosing {
    void run() {
        def whatIsOwnerMethod = { getOwner() }               
        assert whatIsOwnerMethod() == this                   
        def whatIsOwner = { owner }                          
        assert whatIsOwner() == this                         
    }
}
class EnclosedInInnerClass {
    class Inner {
        Closure cl = { owner }                               
    }
    void run() {
        def inner = new Inner()
        assert inner.cl() == inner                           
    }
}
class NestedClosures {
    void run() {
        def nestedClosures = {
			// cl的外围直接闭包是nestedClosures
            def cl = { owner }                               
            cl()
        }
        assert nestedClosures() == nestedClosures            
    }
}

def enclosing = new Enclosing()
enclosing.run()
def enclosedInInnerClass = new EnclosedInInnerClass()
enclosedInInnerClass.run()
def nestedClosures = new NestedClosures()
nestedClosures.run()