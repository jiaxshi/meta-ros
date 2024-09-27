# Generated by superflore -- DO NOT EDIT
#
# Copyright Open Source Robotics Foundation

inherit ros_distro_jazzy
inherit ros_superflore_generated

DESCRIPTION = "Converts ROS messages to and from ASN.1-encoded ETSI ITS messages"
AUTHOR = "Jean-Pierre Busch <jean-pierre.busch@rwth-aachen.de>"
ROS_AUTHOR = "Jean-Pierre Busch <jean-pierre.busch@rwth-aachen.de>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=16;endline=16;md5=58e54c03ca7f821dd3967e2a2cd1596e"

ROS_CN = "etsi_its_messages"
ROS_BPN = "etsi_its_conversion"

ROS_BUILD_DEPENDS = " \
    etsi-its-cam-conversion \
    etsi-its-cam-ts-conversion \
    etsi-its-cpm-ts-conversion \
    etsi-its-denm-conversion \
    rclcpp \
    rclcpp-components \
    ros-environment \
    std-msgs \
    udp-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    etsi-its-cam-conversion \
    etsi-its-cam-ts-conversion \
    etsi-its-cpm-ts-conversion \
    etsi-its-denm-conversion \
    rclcpp \
    rclcpp-components \
    ros-environment \
    std-msgs \
    udp-msgs \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    etsi-its-cam-conversion \
    etsi-its-cam-ts-conversion \
    etsi-its-cpm-ts-conversion \
    etsi-its-denm-conversion \
    rclcpp \
    rclcpp-components \
    ros-environment \
    std-msgs \
    udp-msgs \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS:${PN} += "${ROS_EXEC_DEPENDS}"

# matches with: https://github.com/ros2-gbp/etsi_its_messages-release/archive/release/jazzy/etsi_its_conversion/2.2.0-1.tar.gz
ROS_BRANCH ?= "branch=release/jazzy/etsi_its_conversion"
SRC_URI = "git://github.com/ros2-gbp/etsi_its_messages-release;${ROS_BRANCH};protocol=https"
SRCREV = "766c0d9cf155ffbcc708d1048df9b643685494c4"
S = "${WORKDIR}/git"

ROS_BUILD_TYPE = "ament_cmake"

inherit ros_${ROS_BUILD_TYPE}
