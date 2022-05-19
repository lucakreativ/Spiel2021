import json
import random
from time import process_time


f=open("data.json",)
data=json.load(f)

letzte=[]
name={}
points={}
rating={}
vorpoints={}
gewinner={}
sorted_l={}
absteig={}

player=9
pairing=[3,6,2,7,5,8,9,4,8,9,7,5,6,2,1,3]
pairing=[1,2]
len_pair=len(pairing)
i=1

prob_draw=0.07

while i<=player:
    name[i]=data[str(i)]["name"]
    points[i]=data[str(i)]["points"]
    vorpoints[i]=data[str(i)]["points"]
    rating[i]=data[str(i)]["rating"]
    gewinner[i]=0
    absteig[i]=0
    i+=1

print(name)
print(points)
print(rating)
s=points
def erwartung(welo, belo):
    wer=1/(1+10**((-1/400)*(welo-belo)))
    return wer

point_r=points


durchlauf=1
for i in range(10):
    sorted_l=[]
    paar=0


    while paar<len_pair:
        team_1=pairing[paar]
        team_2=pairing[paar+1]

        wer_team_1=rating[team_1]
        wer_team_2=rating[team_2]

        erwar=erwartung(wer_team_1, wer_team_2)
        rand=random.random()

        if 1-prob_draw<rand:
            vorpoints[team_1]=vorpoints[team_1]+0.5
            vorpoints[team_2]=vorpoints[team_2]+0.5


        elif erwar-prob_draw/2>rand:
            vorpoints[team_1]=vorpoints[team_1]+1


        else:
            vorpoints[team_2]=vorpoints[team_2]+1

        
        paar+=2


    print(s)
    print(points)
    print(vorpoints)


    durchlauf+=1
    vorpoints=points