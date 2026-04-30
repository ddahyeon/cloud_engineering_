//main.js

import {fun} from './content.js';
import {fun2, Person} from './header.js';

import xxx, {yyy,zzz} from './body.js';

//변형된 import 로서 별칭지정 가능
import {yyy as Y} from './body.js';
import {default as X} from './body.js';

// 1. 정의
let num = 10;
const SIZE = 20;


//2. 사용
console.log("num:", num);
console.log("SIZE:", SIZE);
console.log("fun():");
fun();
console.log("fun2():");
fun2();

var p = new Person();
console.log("getMesg():", p.getMesg());

xxx();
yyy();
zzz();

Y();
X();