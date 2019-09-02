def foo = 'foo'
char chr = 'f'

assert chr.getClass() == Character
assert ((char) 'f').class == Character
assert ((char) "f").class == Character
assert 'f'.getClass() == String
assert 'foo'.getClass() == String
assert "foo".getClass() == String
assert "${foo}".getClass() in GString