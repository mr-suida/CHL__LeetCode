
# Welcome.
# In this kata you are required to, given a string, 
# replace every letter with its position in the alphabet.
# If anything in the text isn't a letter, ignore it and don't return it.
 
# date: ??/??/???? ??:?? PM/AM
# I'm: Normal?

# Runtime: ?? ms
# Memory Usage: ?? MB

def alphabet_position(text):
    return ' '.join([ str(ord(x)-96) for x in text.lower() if x.isalpha()])
