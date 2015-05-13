#!/bin/bash

./make.sh

declare -i z=3

for i in `seq 1 2`
    do
        for n in `seq 1 5`;
            do
                java PuzzleCreator $i ./output/output.txt 1 >> ${i}time_and_trys.txt
            done
    done 

while [ 1 -le 2 ]
    do 
	THREADS=1
        while [ $THREADS -le 16 ]
	    do
		java PuzzleCreator 10 ./output/output.txt $THREADS >> create20parallel${THREADS}.txt
		let THREADS=THREADS*2
	    done
    done


