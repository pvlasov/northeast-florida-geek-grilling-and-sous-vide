/**
 * Define cooking grammar
 */
grammar Cooking;

@header {
    package us.vlasov.cooking;
}

/**
 * Nutrition consists of provisioning raw food, cooking it, storing, and finally consuming.
 */
nutrition: shop prepare 'consume';

/**
 * This grammar covers shopping at Costco and Fisherman Dock. 
 */
shop: costco | fishermans_dock;

costco: 'Costco' costco_food;

costco_food: steak | 'chicken' | lamb | 'corvina' | pork;

steak : ('tenderloin' | 'strip') 'steak';

lamb: 'lamb' ('rack' | 'chops' | 'leg');

pork: 'pork' 'ribs';

fishermans_dock: 'Fisherman\'s Dock' fd_food;

fd_food: 'salmon' | 'shrimp';

/**
 * Preparation consists of zero or more steps.
 * Constraints such as no repetition of steps except freezing
 * are not expressed in the grammar.
 */
prepare: step*;

step: 'season' | grill | 'bag' | 'freeze' | sous_vide;

grill: 'grill' ('charcoal' | 'electric' | 'pan' | 'toaster oven'); 

/**
 * Souce vide process includes food (vacuum) bagging,
 * optional freezing and then cooking in the sous vide machine.
 */
sous_vide: 'bag' 'freeze'? 'sous_vide'; 
 
