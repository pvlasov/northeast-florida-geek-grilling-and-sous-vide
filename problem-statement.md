# Problem statement

There are many different ways to obtain nutrition. The ways explained in this book 
are intended to solve the following constrained optimization problem: "Maximize food 
quality and dining experience per calorie consumed while minimizing the shopping/cooking 
_active_ time and budget."

In other words we want our food be healthy and tasty while spending minimum _active 
time_ and money on food provisioning and preparation. _Active time_ means the time which 
requires human involvement. For example, some sous vide recipes take several hours or 
even days, but their _active time_ is just several minutes - put the food item in, set 
time and temperature, and then take the food item out when it is ready.

The cooking approaches described here attempt to minimize _active time_ in total and 
also to spread it over the calendar time. 

## Cooking grammar

Cooking described in this book consist from a series of steps, pretty much as a computer 
program. Therefore, we will use "cooking grammar" to describe the process:

```
nutrition: shop prepare 'consume';

shop: costco | fisherman_dock;

costco: 'Costco' costco_food;

costco_food: steak | 'chicken' | lamb | 'corvina' | pork;

steak : ('tenderloin' | 'strip') 'steak';

lamb: 'lamb' ('rack' | 'chops' | 'leg');

pork: 'pork' 'ribs';

fisherman_dock: 'Fisherman Dock' fd_food;

fd_food: 'salmon' | 'shrimp';

prepare: step*;

step: 'season' | grill | 'bag' | 'freeze' | sous_vide;

grill: 'grill' ('charcoal' | 'electric' | 'pan' | 'toaster oven'); 

sous_vide: 'bag' 'freeze'? 'sous_vide';  
```    

The full grammar project is available here - https://github.com/pvlasov/northeast-florida-geek-grilling-and-sous-vide/cooking-grammar.

### nutrition

![nutrition](cooking-grammar/images/nutrition.png)

### shop

![shop](cooking-grammar/images/shop.png)

 