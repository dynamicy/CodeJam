Power of Cryptography 

Background

Current work in cryptography involves (among other things) large prime numbers and computing powers of numbers modulo functions of these primes. Work in this area has resulted in the practical use of results from number theory and other branches of mathematics once considered to be of only theoretical interest.

This problem involves the efficient computation of integer roots of numbers.

The Problem

Given an integer tex2html_wrap_inline32 and an integer tex2html_wrap_inline34 you are to write a program that determines tex2html_wrap_inline36 , the positive tex2html_wrap_inline38 root of p. In this problem, given such integers n and p, p will always be of the form tex2html_wrap_inline48 for an integer k (this integer is what your program must find).

The Input

The input consists of a sequence of integer pairs n and p with each integer on a line by itself. For all such pairs tex2html_wrap_inline56 , tex2html_wrap_inline58 and there exists an integer k, tex2html_wrap_inline62 such that tex2html_wrap_inline64 .

The Output

For each integer pair n and p the value tex2html_wrap_inline36 should be printed, i.e., the number k such that tex2html_wrap_inline64 .

Sample Input

2
16
3
27
7
4357186184021382204544

Sample Output

4
3
1234
