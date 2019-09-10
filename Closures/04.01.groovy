class Enclosing {
    void run() {
        // Enclosing为闭包外围的第一个类，所以返回Enclosing的实例
        def whatIsThisObject = { getThisObject() }         
        assert whatIsThisObject() == this                  
        def whatIsThis = { this }                          
        assert whatIsThis() == this                        
    }
}

class EnclosedInInnerClass {
    class Inner {
        // Inner为闭包外围的第一个类
        Closure cl = { this }                              
    }
    void run() {
        def inner = new Inner()
        assert inner.cl() == inner                         
    }
}

class NestedClosures {
    void run() {
        def nestedClosures = {
            def cl = { this }                              
            cl()
        }
        // NestedClosures为闭包外围的第一个类
        assert nestedClosures() == this                
    }
}


def enclosing = new Enclosing()
enclosing.run()
def enclosedInInnerClass = new EnclosedInInnerClass()
enclosedInInnerClass.run()
def nestedClosures = new NestedClosures()
nestedClosures.run()