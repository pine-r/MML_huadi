package cn.java.serviceImpl;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import cn.java.service.FileService;

@Service("fileService")
public class FileServiceImpl implements FileService {
	@Override
    public String upload(MultipartFile file,String path){
        String fileName = file.getOriginalFilename();
        //扩展名
        //abc.jpg
        String fileExtensionName = fileName.substring(fileName.lastIndexOf(".")+1);
        String uploadFileName = UUID.randomUUID().toString()+"."+fileExtensionName;
//        logger.info("开始上传文件,上传文件的文件名:{},上传的路径:{},新文件名:{}",fileName,path,uploadFileName);
        System.out.println("开始上传文件,上传文件的文件名:{"+fileName+"},上传的路径:{"+path+"},新文件名:{"+uploadFileName+"}");
        File fileDir = new File(path);
        if(!fileDir.exists()){
            fileDir.setWritable(true);
            fileDir.mkdirs();
        }
        File targetFile = new File(path,uploadFileName);


        try {
            file.transferTo(targetFile);
            //文件已经上传成功了


//            FTPUtil.uploadFile(Lists.newArrayList(targetFile));
//            //已经上传到ftp服务器上
//
//            targetFile.delete();
        } catch (IOException e) {
            System.out.println("上传文件异常:"+e);
            return null;
        }
        //A:abc.jpg
        //B:abc.jpg
        return targetFile.getName();
    }

}
