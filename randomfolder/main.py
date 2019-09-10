def roundAns(x,y):
  if((x/y+.5)>=(x//y+1)):
    return True
  else:
    return False
a=4
b=8
if(roundAns(a,b)):
  print("unrounded answer:" , a/b)
  print("rounded answer:" , a//b+1)
else:
  print("unrounded answer:" , a/b)
  print ("rounded answer:" , a//b)
