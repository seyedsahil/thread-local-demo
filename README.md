# thread-local-demo
Demo program created for thread local article

# output from console
```
         LoginThread [INFO]  Login thread [LoginThread: seyed] has been created for 'seyed'.
----------------COUNTER: 1, Name: [LoginThread: seyed]----------------
SessionContextHolder [WARN] 		 Session doesn't exist for login thread '[LoginThread: seyed]'.
             Session [INFO] 				 New session with id 'MTOXNJAZNZKWNTQ0' created for login thread '[LoginThread: seyed]'.
SessionContextHolder [INFO] 		 Session 'MTOXNJAZNZKWNTQ0' added for login thread '[LoginThread: seyed]'.
         LoginThread [INFO]  Login thread '[LoginThread: seyed]' is using session 'MTOXNJAZNZKWNTQ0'.
         LoginThread [INFO]  Login thread '[LoginThread: seyed]' put 'data-[loginthread: seyed]-652171802'. to session 'MTOXNJAZNZKWNTQ0'.
----------------COUNTER: 2, Name: [LoginThread: seyed]----------------
SessionContextHolder [ERROR] 		 Session 'MTOXNJAZNZKWNTQ0' exist for login thread '[LoginThread: seyed]'.
         LoginThread [INFO]  Login thread '[LoginThread: seyed]' is using session 'MTOXNJAZNZKWNTQ0'.
         LoginThread [INFO]  Login thread '[LoginThread: seyed]' put 'data-[loginthread: seyed]-709532306'. to session 'MTOXNJAZNZKWNTQ0'.
----------------COUNTER: 3, Name: [LoginThread: seyed]----------------
SessionContextHolder [ERROR] 		 Session 'MTOXNJAZNZKWNTQ0' exist for login thread '[LoginThread: seyed]'.
SessionContextHolder [WARN] 		 Session 'MTOXNJAZNZKWNTQ0' is inactive for more than 3 seconds, will be invalidated.
             Session [INFO] 				 New session with id 'MJOTMTG4NJC3MJYYMA==' created for login thread '[LoginThread: seyed]'.
SessionContextHolder [INFO] 		 Session 'MJOTMTG4NJC3MJYYMA==' added for login thread '[LoginThread: seyed]'.
         LoginThread [INFO]  Login thread '[LoginThread: seyed]' is using session 'MJOTMTG4NJC3MJYYMA=='.
         LoginThread [INFO]  Login thread '[LoginThread: seyed]' put 'data-[loginthread: seyed]--11399863'. to session 'MJOTMTG4NJC3MJYYMA=='.
         LoginThread [INFO]  Login thread [LoginThread: sahil] has been created for 'sahil'.
----------------COUNTER: 1, Name: [LoginThread: sahil]----------------
SessionContextHolder [WARN] 		 Session doesn't exist for login thread '[LoginThread: sahil]'.
             Session [INFO] 				 New session with id 'MZOTNTQXNTKXOTMW' created for login thread '[LoginThread: sahil]'.
SessionContextHolder [INFO] 		 Session 'MZOTNTQXNTKXOTMW' added for login thread '[LoginThread: sahil]'.
         LoginThread [INFO]  Login thread '[LoginThread: sahil]' is using session 'MZOTNTQXNTKXOTMW'.
         LoginThread [INFO]  Login thread '[LoginThread: sahil]' put 'data-[loginthread: sahil]-1708874466'. to session 'MZOTNTQXNTKXOTMW'.
----------------COUNTER: 4, Name: [LoginThread: seyed]----------------
SessionContextHolder [ERROR] 		 Session 'MJOTMTG4NJC3MJYYMA==' exist for login thread '[LoginThread: seyed]'.
         LoginThread [INFO]  Login thread '[LoginThread: seyed]' is using session 'MJOTMTG4NJC3MJYYMA=='.
         LoginThread [INFO]  Login thread '[LoginThread: seyed]' put 'data-[loginthread: seyed]-2070192518'. to session 'MJOTMTG4NJC3MJYYMA=='.
----------------COUNTER: 2, Name: [LoginThread: sahil]----------------
SessionContextHolder [ERROR] 		 Session 'MZOTNTQXNTKXOTMW' exist for login thread '[LoginThread: sahil]'.
         LoginThread [INFO]  Login thread '[LoginThread: sahil]' is using session 'MZOTNTQXNTKXOTMW'.
         LoginThread [INFO]  Login thread '[LoginThread: sahil]' put 'data-[loginthread: sahil]-1524408497'. to session 'MZOTNTQXNTKXOTMW'.
----------------COUNTER: 5, Name: [LoginThread: seyed]----------------
SessionContextHolder [ERROR] 		 Session 'MJOTMTG4NJC3MJYYMA==' exist for login thread '[LoginThread: seyed]'.
SessionContextHolder [WARN] 		 Session 'MJOTMTG4NJC3MJYYMA==' is inactive for more than 3 seconds, will be invalidated.
             Session [INFO] 				 New session with id 'NDOTMTMZMJCZOTI5NG==' created for login thread '[LoginThread: seyed]'.
SessionContextHolder [INFO] 		 Session 'NDOTMTMZMJCZOTI5NG==' added for login thread '[LoginThread: seyed]'.
         LoginThread [INFO]  Login thread '[LoginThread: seyed]' is using session 'NDOTMTMZMJCZOTI5NG=='.
         LoginThread [INFO]  Login thread '[LoginThread: seyed]' put 'data-[loginthread: seyed]-802842621'. to session 'NDOTMTMZMJCZOTI5NG=='.
----------------COUNTER: 3, Name: [LoginThread: sahil]----------------
SessionContextHolder [ERROR] 		 Session 'MZOTNTQXNTKXOTMW' exist for login thread '[LoginThread: sahil]'.
SessionContextHolder [WARN] 		 Session 'MZOTNTQXNTKXOTMW' is inactive for more than 3 seconds, will be invalidated.
             Session [INFO] 				 New session with id 'NTOXMDQ4MDC1NZK4' created for login thread '[LoginThread: sahil]'.
SessionContextHolder [INFO] 		 Session 'NTOXMDQ4MDC1NZK4' added for login thread '[LoginThread: sahil]'.
         LoginThread [INFO]  Login thread '[LoginThread: sahil]' is using session 'NTOXMDQ4MDC1NZK4'.
         LoginThread [INFO]  Login thread '[LoginThread: sahil]' put 'data-[loginthread: sahil]-392953757'. to session 'NTOXMDQ4MDC1NZK4'.
----------------COUNTER: 6, Name: [LoginThread: seyed]----------------
SessionContextHolder [ERROR] 		 Session 'NDOTMTMZMJCZOTI5NG==' exist for login thread '[LoginThread: seyed]'.
         LoginThread [INFO]  Login thread '[LoginThread: seyed]' is using session 'NDOTMTMZMJCZOTI5NG=='.
         LoginThread [INFO]  Login thread '[LoginThread: seyed]' put 'data-[loginthread: seyed]-1593384225'. to session 'NDOTMTMZMJCZOTI5NG=='.
----------------COUNTER: 4, Name: [LoginThread: sahil]----------------
SessionContextHolder [ERROR] 		 Session 'NTOXMDQ4MDC1NZK4' exist for login thread '[LoginThread: sahil]'.
         LoginThread [INFO]  Login thread '[LoginThread: sahil]' is using session 'NTOXMDQ4MDC1NZK4'.
         LoginThread [INFO]  Login thread '[LoginThread: sahil]' put 'data-[loginthread: sahil]--317051152'. to session 'NTOXMDQ4MDC1NZK4'.
----------------COUNTER: 7, Name: [LoginThread: seyed]----------------
SessionContextHolder [ERROR] 		 Session 'NDOTMTMZMJCZOTI5NG==' exist for login thread '[LoginThread: seyed]'.
SessionContextHolder [WARN] 		 Session 'NDOTMTMZMJCZOTI5NG==' is inactive for more than 3 seconds, will be invalidated.
             Session [INFO] 				 New session with id 'NJOZMTI4NZK1MJG=' created for login thread '[LoginThread: seyed]'.
SessionContextHolder [INFO] 		 Session 'NJOZMTI4NZK1MJG=' added for login thread '[LoginThread: seyed]'.
         LoginThread [INFO]  Login thread '[LoginThread: seyed]' is using session 'NJOZMTI4NZK1MJG='.
         LoginThread [INFO]  Login thread '[LoginThread: seyed]' put 'data-[loginthread: seyed]-422094691'. to session 'NJOZMTI4NZK1MJG='.
----------------COUNTER: 5, Name: [LoginThread: sahil]----------------
SessionContextHolder [ERROR] 		 Session 'NTOXMDQ4MDC1NZK4' exist for login thread '[LoginThread: sahil]'.
SessionContextHolder [WARN] 		 Session 'NTOXMDQ4MDC1NZK4' is inactive for more than 3 seconds, will be invalidated.
             Session [INFO] 				 New session with id 'NZOXMTK3NJE1MTA2' created for login thread '[LoginThread: sahil]'.
SessionContextHolder [INFO] 		 Session 'NZOXMTK3NJE1MTA2' added for login thread '[LoginThread: sahil]'.
         LoginThread [INFO]  Login thread '[LoginThread: sahil]' is using session 'NZOXMTK3NJE1MTA2'.
         LoginThread [INFO]  Login thread '[LoginThread: sahil]' put 'data-[loginthread: sahil]-1414035009'. to session 'NZOXMTK3NJE1MTA2'.
----------------COUNTER: 8, Name: [LoginThread: seyed]----------------
SessionContextHolder [ERROR] 		 Session 'NJOZMTI4NZK1MJG=' exist for login thread '[LoginThread: seyed]'.
         LoginThread [INFO]  Login thread '[LoginThread: seyed]' is using session 'NJOZMTI4NZK1MJG='.
         LoginThread [INFO]  Login thread '[LoginThread: seyed]' put 'data-[loginthread: seyed]-718180519'. to session 'NJOZMTI4NZK1MJG='.
----------------COUNTER: 6, Name: [LoginThread: sahil]----------------
SessionContextHolder [ERROR] 		 Session 'NZOXMTK3NJE1MTA2' exist for login thread '[LoginThread: sahil]'.
         LoginThread [INFO]  Login thread '[LoginThread: sahil]' is using session 'NZOXMTK3NJE1MTA2'.
         LoginThread [INFO]  Login thread '[LoginThread: sahil]' put 'data-[loginthread: sahil]-664783391'. to session 'NZOXMTK3NJE1MTA2'.
----------------COUNTER: 9, Name: [LoginThread: seyed]----------------
SessionContextHolder [ERROR] 		 Session 'NJOZMTI4NZK1MJG=' exist for login thread '[LoginThread: seyed]'.
SessionContextHolder [WARN] 		 Session 'NJOZMTI4NZK1MJG=' is inactive for more than 3 seconds, will be invalidated.
             Session [INFO] 				 New session with id 'ODOXODG4NDY4NJE4' created for login thread '[LoginThread: seyed]'.
SessionContextHolder [INFO] 		 Session 'ODOXODG4NDY4NJE4' added for login thread '[LoginThread: seyed]'.
         LoginThread [INFO]  Login thread '[LoginThread: seyed]' is using session 'ODOXODG4NDY4NJE4'.
         LoginThread [INFO]  Login thread '[LoginThread: seyed]' put 'data-[loginthread: seyed]-1568254028'. to session 'ODOXODG4NDY4NJE4'.
----------------COUNTER: 7, Name: [LoginThread: sahil]----------------
SessionContextHolder [ERROR] 		 Session 'NZOXMTK3NJE1MTA2' exist for login thread '[LoginThread: sahil]'.
SessionContextHolder [WARN] 		 Session 'NZOXMTK3NJE1MTA2' is inactive for more than 3 seconds, will be invalidated.
             Session [INFO] 				 New session with id 'OTOZMJCXMTU2OTA=' created for login thread '[LoginThread: sahil]'.
SessionContextHolder [INFO] 		 Session 'OTOZMJCXMTU2OTA=' added for login thread '[LoginThread: sahil]'.
         LoginThread [INFO]  Login thread '[LoginThread: sahil]' is using session 'OTOZMJCXMTU2OTA='.
         LoginThread [INFO]  Login thread '[LoginThread: sahil]' put 'data-[loginthread: sahil]--1189100300'. to session 'OTOZMJCXMTU2OTA='.
----------------COUNTER: 10, Name: [LoginThread: seyed]----------------
SessionContextHolder [ERROR] 		 Session 'ODOXODG4NDY4NJE4' exist for login thread '[LoginThread: seyed]'.
         LoginThread [INFO]  Login thread '[LoginThread: seyed]' is using session 'ODOXODG4NDY4NJE4'.
         LoginThread [INFO]  Login thread '[LoginThread: seyed]' put 'data-[loginthread: seyed]-1108310775'. to session 'ODOXODG4NDY4NJE4'.
----------------COUNTER: 8, Name: [LoginThread: sahil]----------------
SessionContextHolder [ERROR] 		 Session 'OTOZMJCXMTU2OTA=' exist for login thread '[LoginThread: sahil]'.
         LoginThread [INFO]  Login thread '[LoginThread: sahil]' is using session 'OTOZMJCXMTU2OTA='.
         LoginThread [INFO]  Login thread '[LoginThread: sahil]' put 'data-[loginthread: sahil]-857394600'. to session 'OTOZMJCXMTU2OTA='.
----------------COUNTER: 9, Name: [LoginThread: sahil]----------------
SessionContextHolder [ERROR] 		 Session 'OTOZMJCXMTU2OTA=' exist for login thread '[LoginThread: sahil]'.
SessionContextHolder [WARN] 		 Session 'OTOZMJCXMTU2OTA=' is inactive for more than 3 seconds, will be invalidated.
             Session [INFO] 				 New session with id 'MTA6LTKWMJUXOTM3' created for login thread '[LoginThread: sahil]'.
SessionContextHolder [INFO] 		 Session 'MTA6LTKWMJUXOTM3' added for login thread '[LoginThread: sahil]'.
         LoginThread [INFO]  Login thread '[LoginThread: sahil]' is using session 'MTA6LTKWMJUXOTM3'.
         LoginThread [INFO]  Login thread '[LoginThread: sahil]' put 'data-[loginthread: sahil]-478438020'. to session 'MTA6LTKWMJUXOTM3'.
----------------COUNTER: 10, Name: [LoginThread: sahil]----------------
SessionContextHolder [ERROR] 		 Session 'MTA6LTKWMJUXOTM3' exist for login thread '[LoginThread: sahil]'.
         LoginThread [INFO]  Login thread '[LoginThread: sahil]' is using session 'MTA6LTKWMJUXOTM3'.
         LoginThread [INFO]  Login thread '[LoginThread: sahil]' put 'data-[loginthread: sahil]-983654251'. to session 'MTA6LTKWMJUXOTM3'.
Thread [Main] exiting.

Process finished with exit code 0
```
