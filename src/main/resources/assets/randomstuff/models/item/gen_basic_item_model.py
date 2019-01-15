while True:
    name = input("name of basic item model to generate: ")
    template = '{\n\t"parent": "item/generated",\n\t"textures": {\n\t\t"layer0": "randomstuff:items/ITEMNAME"\n\t}\n}'
    open(name+'.json','w').write(template.replace('ITEMNAME',name))