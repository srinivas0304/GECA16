System.out.println("---------------------------------------");
		
		Set s=new HashSet();
		s.add(12);
		s.add("addla");
		s.add(12);//Set interface cannot accept dubplicate values
		s.add(10);
		s.add('b');
		s.add(5);
		s.add(3.12f);
		
		System.out.println(s);
		
		System.out.println("--------------------------------------");
		
		Queue q=new PriorityQueue<>();
		q.add(7);
		q.add(10);
		q.add(12);
		q.add(5);
		q.add(8);
		System.out.println(q);
		
		System.out.println("-----------------------------------");
		
		Map m=new HashMap<>();
		m.put(1, "sri");
		m.put(2, "addla");
		
		System.out.println(m);
