\p 5001
tp:hopen `::5000;
onehr_wavg:([]coin:enlist `;fiatSterling:0nf);
upd:{x insert y;if[exec traded[0] from y;.u.pub[`onehr_wavg;0!?[`quotes;((>;`time;(-;.z.n;1n));(=;`traded;1b));(enlist `coin)!enlist `sym;(enlist `fiatSterling)!enlist (wavg;`qty;`gbpPrice)]];]};
\l tick/u.q
tp(".u.sub";`quotes;`);
.u.init[];
.z.ts:{if[`quotes in tables[];![`quotes;enlist (<;`time;(-;.z.n;1n));0b;`symbol$()]];.Q.gc[];};
\t 3600000
