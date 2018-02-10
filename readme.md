# 运行须知

## 安装如下软件
```
kubectl
gradle
docker
```

## 一，配置本机HOSTS

```
52.196.163.18   master
54.168.141.255  node1
13.230.129.20   node2
13.231.73.19    node3
```


创建service
E:\microservice\dmall-inventory-service-base-master>D:\BaiduNetdiskDownload\kube
ctl create -f manifests\jenkins.yaml


## 二，在自己的指定端口下操作

林文军
kubectl exec -it inventory sh
 林文军
林文军
kubectl create -f inventory-service.yaml
 林文军
林文军
kubectl delete -f inventory-service.yaml
 林文军
林文军
kubectl get pod
 林文军
林文军
kubectl logs inventory

wget -qO - "http://localhost:8080/inventories"
