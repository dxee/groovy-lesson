import org.codehaus.groovy.runtime.typehandling.GroovyCastException

// 含有单个字符的字符串， 两种转换方式没有差别
assert ((char) "c").class==Character
assert ("c" as char).class==Character

// 含有多个字符的字符串，结果是不一致的
try {
  ((char) 'cx') == 'c'
  assert false: 'will fail - not castable'
} catch(GroovyCastException e) {
}
assert ('cx' as char) == 'c'
assert 'cx'.asType(char) == 'c'

