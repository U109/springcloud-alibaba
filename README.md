sentinel : 

java -Dserver.port=8080 -Dcsp.sentinel.dashboard.server=localhost:8080 -Dproject.name=sentinel-dashboard -jar sentinel-dashboard.jar

���� -Dserver.port=8080 ����ָ�� Sentinel ����̨�˿�Ϊ 8080��

����	����
-Dcsp.sentinel.dashboard.server=localhost:8080	�� Sentinel �����ָ������̨�ĵ�ַ
-Dproject.name=sentinel-dashboard	�� Sentinel ָ��Ӧ�����ƣ����������Ӧ��Ӧ�����ƾ�Ϊ sentinel-dashboard
�� Sentinel 1.6.0 ��Sentinel ����̨��������ĵ�¼���ܣ�Ĭ���û��������붼�� sentinel���û�����ͨ�����²����������ã�

-Dsentinel.dashboard.auth.username=sentinel ����ָ������̨�ĵ�¼�û���Ϊ sentinel��
-Dsentinel.dashboard.auth.password=123456 ����ָ������̨�ĵ�¼����Ϊ 123456�����ʡ��������������Ĭ���û��������Ϊ sentinel��
-Dserver.servlet.session.timeout=7200 ����ָ�� Spring Boot ����� session �Ĺ���ʱ�䣬�� 7200 ��ʾ 7200 �룻60m ��ʾ 60 ���ӣ�Ĭ��Ϊ 30 ����
