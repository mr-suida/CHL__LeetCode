
# Write a function that when given a URL as a string, parses 
# out just the domain name and returns it as a string. For example:
#
# url = "http://github.com/carbonfive/raygun" -> domain name = "github"
# url = "http://www.zombie-bites.com"         -> domain name = "zombie-bites"
# url = "https://www.cnet.com"                -> domain name = cnet"

# date: ??/??/???? ??:?? PM/AM
# I'm: Normal?
  
# Runtime: ?? ms
# Memory Usage: ?? MB

import re
def domain_name(u):
    dt = re.findall(r"[\w-]{1,}\.",u)
    return dt[0][:-1] if dt[0] != 'www.' else dt[1][:-1]
