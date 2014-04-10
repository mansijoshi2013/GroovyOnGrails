hibernate {
    cache.use_second_level_cache = true
    cache.use_query_cache = false
    cache.region.factory_class = 'net.sf.ehcache.hibernate.EhCacheRegionFactory'
}
// environment specific settings
environments {
    development {
        dataSource {
            dbCreate = "update" // one of 'create', 'create-drop', 'update', 'validate', ''
            //url = "jdbc:h2:mem:devDb;MVCC=TRUE;LOCK_TIMEOUT=10000"
			url = "jdbc:mysql://localhost:3306/cmpe281"
			pooled = true
			//driverClassName = "org.h2.Driver"
			driverClassName = "com.mysql.jdbc.Driver"
			username = "root"
			password = ""
        }
    }
    test {
        dataSource {
			pooled = true
            dbCreate = "update"  // 'create', 'create-drop','update'
			url = "jdbc:mysql://localhost:3306/cmpe281"
			driverClassName = "com.mysql.jdbc.Driver"
			username = "root"
			password = ""
        }
    }
	production {
		dataSource {
		   //dialect = 'org.hibernate.dialect.MySQL5InnoDBDialect'
		   url = "jdbc:mysql://localhost:3306/cmpe281"
		   driverClassName = "com.mysql.jdbc.Driver"
		   username = "root"
		   password = ""
		   //pooled = false
		   dbCreate = 'update' // use 'update', 'validate', 'create' or 'create-drop'
		   //jndiName = 'java:comp/env/jdbc/gumball_db'
		}
	 }
}


